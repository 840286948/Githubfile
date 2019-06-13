package com.xjk.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ip地址工具类
 * @author ACGkaka
 *
 */
public class NetworkIP {


/**
* 解析ip地址
* 
* 设置访问地址为http://ip.taobao.com/service/getIpInfo.php
* 设置请求参数为ip=[已经获得的ip地址]
* 设置解码方式为UTF-8
* 
* @param content  请求的参数 格式为：ip=192.168.1.101
* @param encoding 服务器端请求编码。如GBK,UTF-8等
* @return
* @throws UnsupportedEncodingException
*/
	
	
	public static String getAddresses(String content, String encoding){
		try {
			System.out.println(content+""+encoding);
			//设置访问地址
			String urlStr = "http://ip.taobao.com/service/getIpInfo.php";
			// 从http://whois.pconline.com.cn取得IP所在的省市区信息
			String returnStr = getResult(urlStr, content, encoding);
			if (returnStr != null) {
				// 处理返回的省市区信息
				// System.out.println(returnStr);
				String[] temp = returnStr.split(",");
				if (temp.length < 3) {
					return "0";// 无效IP，局域网测试
				}
			
				//String country = ""; //国家
				String area = ""; //地区
				String region = ""; //省份
				String city = ""; //市区
				//String county = ""; //地区
				//String isp = ""; //ISP公司
				for (int i = 0; i < temp.length; i++) {
					switch (i) {
					/*case 2:
						country = (temp[i].split(":"))[1].replaceAll("\"", "");
						country = URLDecoder.decode(country, encoding);// 国家
						break;*/
					case 3:
						area = (temp[i].split(":"))[1].replaceAll("\"", "");
						area = URLDecoder.decode(area, encoding);// 地区
						break;
					case 4:
						region = (temp[i].split(":"))[1].replaceAll("\"", "");
						region = URLDecoder.decode(region, encoding);// 省份
						break;
					case 5:
						city = (temp[i].split(":"))[1].replaceAll("\"", "");
						city = URLDecoder.decode(city, encoding);// 市区
						if("内网IP".equals(city)) {
							return "地址为：内网IP";
						}
						break;
					/*case 6:
						county = (temp[i].split(":"))[1].replaceAll("\"", "");
						county = URLDecoder.decode(county, encoding);// 地区
						break;*/
					/*case 7:
						isp = (temp[i].split(":"))[1].replaceAll("\"", "");
						isp = URLDecoder.decode(isp, encoding); // ISP公司
						break;*/
					}
				}
				return new StringBuffer().append(region+"省").append(city+"市")
						.toString();
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}


/**
* 访问目标地址并获取返回值
* @param urlStr 请求的地址
* @param content 请求的参数 格式为：ip=192.168.1.101
* @param encoding 服务器端请求编码。如GBK,UTF-8等
* @return
*/
	private static String getResult(String urlStr, String content, String encoding) {
		URL url = null;
		HttpURLConnection connection = null;
		try {
			url = new URL(urlStr);
			connection = (HttpURLConnection) url.openConnection();// 新建连接实例
			connection.setConnectTimeout(2000);// 设置连接超时时间，单位毫秒
			connection.setReadTimeout(33000);// 设置读取数据超时时间，单位毫秒
			connection.setDoOutput(true);// 是否打开输出流 true|false
			connection.setDoInput(true);// 是否打开输入流true|false
			connection.setRequestMethod("POST");// 提交方法POST|GET
			connection.setUseCaches(false);// 是否缓存true|false
			connection.connect();// 打开连接端口
			DataOutputStream out = new DataOutputStream(connection.getOutputStream());// 打开输出流往对端服务器写数据
			out.writeBytes(content);// 写数据,也就是提交你的表单 name=xxx&pwd=xxx
			out.flush();// 刷新
			out.close();// 关闭输出流
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding));// 往对端写完数据对端服务器返回数据
			// ,以BufferedReader流来读取
			StringBuffer buffer = new StringBuffer();
			String line = "";
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			reader.close();
			return buffer.toString();
		} catch (IOException e) {
				return null;
		} finally {
			if (connection != null) {
				connection.disconnect();// 关闭连接
			}
		}
	}
/*	public static void main(String[] args) {
		System.out.println("ip=43.250.200.73utf-8");
		
		try {
			System.out.println(NetworkIP.getAddresses("ip=119.39.248.123","utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/


}
