package org.lyon_yan.module.android_tomcat_lite.core;

import java.util.Map;

import fi.iki.elonen.NanoHTTPD;

/**
 * Http转换器
 * @author Lyon_Yan
 * <br/><b>time</b>: 2015年9月12日 下午5:21:00
 */
public class HttpConverter extends NanoHTTPD{

	public HttpConverter(int port) {
		super(port);
		// TODO Auto-generated constructor stub
	}

	public HttpConverter(String hostname, int port) {
		super(hostname, port);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Response serve(String uri, Method method,
			Map<String, String> headers, Map<String, String> parms,
			Map<String, String> files) {
		// TODO Auto-generated method stub
		return super.serve(uri, method, headers, parms, files);
	}
}
