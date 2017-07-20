package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.Page;
import com.ssm.mapper.TbPicturesMapper;
import com.ssm.po.TbPictures;
import com.ssm.po.TbPicturesExample;
import com.ssm.po.TbPicturesExample.Criteria;
import com.ssm.service.PicturesService;
import com.ssm.util.PageData;
import com.ssm.util.PicturesUtils;

/**
 * 图片管理service
 * @author zhefeng.ning
 *
 */
@Service
public class PicturesServiceImpl implements PicturesService {

	@Autowired
	private TbPicturesMapper picturesMapper;
	/**
	 * 查询图片
	 */
	@Override
	public List<PageData> list(Page page) throws Exception {
		String keyword = page.getPd().getString("keyword");
		TbPicturesExample example = new TbPicturesExample();
		Criteria criteria = example.createCriteria();
		if(keyword != null && "".equals(keyword)){
			criteria.andTitleEqualTo(keyword);
		}
		List<TbPictures> picturesList = picturesMapper.selectByExample(example);
		List<PageData> pdList = PicturesUtils.listPicturesToListPd(picturesList);
		return pdList;
	}
	/**
	 * 保存图片
	 */
	@Override
	public void save(PageData pd) throws Exception {
		TbPictures pictures = new TbPictures();
		pictures.setBz(pd.getString("BZ"));
		pictures.setCreatetime(pd.getString("CREATETIME"));
		pictures.setMasterId(pd.getString("MASTER_ID"));
		pictures.setName(pd.getString("NAME"));
		pictures.setPath(pd.getString("PATH"));
		pictures.setPicturesId(pd.getString("PICTURES_ID"));
		pictures.setTitle(pd.getString("TITLE"));
		picturesMapper.insert(pictures);
	}
	
	/**
	 *  删除文件
	 */
	@Override
	public Boolean delete(PageData pd) throws Exception {
		int deletePicture = picturesMapper.deleteByPrimaryKey(pd.getString("PICTURES_ID"));
		if(deletePicture == 1){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 修改文件
	 */
	@Override
	public void edit(PageData pd) throws Exception {
		TbPictures picture = PicturesUtils.pdToPictures(pd);
		picturesMapper.updateByPrimaryKey(picture);
	}
	
	/**
	 * 跳转编辑页面
	 */
	@Override
	public PageData findById(PageData pd) throws Exception {
		TbPictures pictures = picturesMapper.selectByPrimaryKey(pd.getString("PICTURES_ID"));
		pd = PicturesUtils.pictureToPd(pictures);
		return pd;
	}
	
	/**
	 * 修改页面删除图片
	 */
	@Override
	public Boolean delTp(PageData pd) throws Exception {
		int deletePicture = picturesMapper.deleteByPrimaryKey(pd.getString("PATH"));
		if(deletePicture == 1){
			return true;
		}else{
			return false;
		}
		
	}

}
