/**
 * 
 */
package com.hundsun.o2o.util;

/**
 * @author Administrator
 *
 */
public class PathUtil {
	 private static String seperator=System.getProperty("file.seperator");
	/**
	 * 
	 */
	public PathUtil() {
		// TODO Auto-generated constructor stub
	}
public static String getImgbasePath() {

	String os=System.getProperty("os.name");
	String basePath="";
	if (os.toLowerCase().startsWith("win")) {
		basePath="D:/image/";
	}else {
		basePath="/home/image/";
	}
	basePath=basePath.replace("/", seperator);
	return basePath;
}



public static String getShopImagePath(long shopId) {
	String imagePath="/upload/item/shop/"+shopId+"/";
	return imagePath.replace("/", seperator);
	
	
}
}
