/**
* 
*/
package com.hundsun.o2o.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;

import org.apache.ibatis.javassist.runtime.Cflow;
import org.jaxen.BaseXPath;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.mchange.v1.lang.GentleThread;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

/**
 * @author Administrator
 *
 */
public class ImageUtil {
	private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
	private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	private static final Random r = new Random();

	/**
		 * 
		 */
	public ImageUtil() {
		// TODO Auto-generated constructor stub
	}

	public static String generateThumbnails(CommonsMultipartFile thumbnail, String targetAddr) {
		String realFileName = getRandomFileName();
		String extension = getFileExtension(thumbnail);
		makeDirPath(targetAddr);
		String relativeAddr = targetAddr + realFileName + extension;
		File dest = new File(PathUtil.getImgbasePath() + relativeAddr);
		try {
			Thumbnails.of(thumbnail.getInputStream()).size(200, 200)
					.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.jpg")), 0.25f)
					.outputQuality(0.8f).toFile(dest);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return relativeAddr;
	}

	private static void makeDirPath(String targetAddr) {
		// TODO Auto-generated method stub
		// 创建目标路径所涉及到的目录，即/home/work/a/xxx.jpg,则这三个文件夹都需要自动创建
		String realFileParentpath = PathUtil.getImgbasePath() + targetAddr;
		File dirPath = new File("realFileParentpath");
		if (!dirPath.exists()) {
			dirPath.mkdir();
		}
	}

	private static String getFileExtension(CommonsMultipartFile cFile) {
		// TODO Auto-generated method stub
		// 获取输入文件流的扩展名
		String originalFileName = cFile.getOriginalFilename();

		return originalFileName.substring(originalFileName.lastIndexOf("."));
	}

	private static String getRandomFileName() {
		// TODO Auto-generated method stub
		// 获取随机的五位数
		int rannum = r.nextInt(89999) + 10000;
		String nowTimeStr = sDateFormat.format(new Date());
		return nowTimeStr + rannum;
	}

	public static void main() throws IOException {
		Thumbnails.of(new File("D:/image/")).size(200, 200)
				.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.jpg")), 0.25f)
				.outputQuality(0.8f).outputQuality(0.8f).toFile("/users/image/1.jpg");
	}

}
