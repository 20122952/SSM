package com.ssm.util;

import java.util.ArrayList;
import java.util.List;

import com.ssm.po.TbPictures;

/**
 * Pictures工具类
 * @author zhefeng.ning
 * @创建时间 2017年4月17日 上午9:23:07
 */
public class PicturesUtils {

	public static List<PageData> listPicturesToListPd(List<TbPictures> picturesList) {
		List<PageData> pdList = new ArrayList<PageData>();
		for (int i = 0; i < picturesList.size(); i++) {
			PageData pd = new PageData();
			pd.put("PICTURES_ID", picturesList.get(i).getPicturesId());
			pd.put("TITLE", picturesList.get(i).getTitle());
			pd.put("NAME", picturesList.get(i).getName());
			pd.put("PATH", picturesList.get(i).getPath());
			pd.put("CREATETIME", picturesList.get(i).getCreatetime());
			pd.put("MASTER_ID", picturesList.get(i).getMasterId());
			pd.put("BZ", picturesList.get(i).getBz());
			pdList.add(pd);
		}
		return pdList;
	}

	/**
	 * pd to Picture类
	 * @param pd
	 * @return
	 */
	public static TbPictures pdToPictures(PageData pd) {
		TbPictures pictures = new TbPictures();
		pictures.setPicturesId(pd.getString("PICTURES_ID"));
		pictures.setTitle(pd.getString("TITLE"));
		pictures.setName(pd.getString("NAME"));
		pictures.setPath(pd.getString("PATH"));
		pictures.setCreatetime(pd.getString("CREATETIME"));
		pictures.setMasterId(pd.getString("MASTER_ID"));
		pictures.setBz(pd.getString("BZ"));
		return pictures;
	}

	/**
	 * pictureToPd
	 * @param pictures
	 * @return
	 */
	public static PageData pictureToPd(TbPictures pictures) {
		
		PageData pd = new PageData();
		if(pictures.getPicturesId() != null && "".equals(pictures.getPicturesId())){
			pd.put("PICTURES_ID", pictures.getPicturesId());
		}else{
			pd.put("PICTURES_ID", "");
		}
		pd.put("TITLE", pictures.getTitle());
		pd.put("NAME", pictures.getName());
		pd.put("PATH", pictures.getPath());
		pd.put("CREATETIME",pictures.getCreatetime());
		pd.put("MASTER_ID", pictures.getMasterId());
		pd.put("BZ", pictures.getBz());
		return pd;
	}

}
