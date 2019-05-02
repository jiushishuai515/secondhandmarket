package com.tjpu.service.impl;

import com.github.pagehelper.PageHelper;
import com.tjpu.dao.GoodsMapper;
import com.tjpu.pojo.CommentExtend;
import com.tjpu.pojo.Comments;
import com.tjpu.pojo.Goods;
import com.tjpu.service.GoodsService;
import com.tjpu.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


/**
 * 对商品的操作类（增删改查）
 * @ClassName 	GoodServiceImpl
 * @date
 */

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    public int addGood(Goods goods , Integer duration) {
        String startTime = DateUtil.getNowDay();
        String endTime = DateUtil.getLastTime(startTime, duration);
        String polishTime = startTime;
        //添加上架时间，下架时间，擦亮时间
        goods.setPolishTime(polishTime);
        goods.setEndTime(endTime);
        goods.setStartTime(startTime);
        return goodsMapper.insert(goods);
    }

    public Goods getGoodsByPrimaryKey(Integer goodsId) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        return goods;
    }
    
    public Goods getGoodsById(Integer goodsId) {
        Goods goods = goodsMapper.selectById(goodsId);
        return goods;
    }

    public void deleteGoodsByPrimaryKey(Integer id) {
        goodsMapper.deleteByPrimaryKey(id);
    }
    
    public void deleteGoodsByPrimaryKeys(Integer id) {
        goodsMapper.deleteByPrimaryKeys(id);
    }

    public List<Goods> getAllGoods() {
        List<Goods> goods = goodsMapper.selectAllGoods();
        return goods;
    }

    public List<Goods> searchGoods(String name, String describle) {
        List<Goods> goods = goodsMapper.searchGoods(name,describle);
        return  goods;
    }
    
    public List<Goods> getGoodsByStr(Integer limit,String name,String describle) {
        List<Goods> goods = goodsMapper.selectByStr(limit, name, describle);
        return goods;
    }

    public List<Goods> getGoodsByCatelog(Integer id,String name,String describle) {
        List<Goods> goods = goodsMapper.selectByCatelog(id,name,describle);
        return goods;
    }

    public void updateGoodsByPrimaryKeyWithBLOBs(int goodsId,Goods goods) {
        goods.setId(goodsId);
        this.goodsMapper.updateByPrimaryKeyWithBLOBs(goods);
    }

    public List<Goods> getGoodsByCatelogOrderByDate(Integer catelogId,Integer limit) {
        List<Goods> goodsList = goodsMapper.selectByCatelogOrderByDate(catelogId , limit);
        return goodsList;
    }
    
    public List<Goods> getGoodsOrderByDate(Integer limit) {
        List<Goods> goodsList = goodsMapper.selectOrderByDate(limit);
        return goodsList;
    }

    public List<Goods> getGoodsByUserId(Integer user_id) {
        List<Goods> goodsList = goodsMapper.getGoodsByUserId(user_id);
        return goodsList;
    }

	public void updateGoodsByGoodsId(Goods goods) {
		
		goodsMapper.updateGoodsByGoodsId(goods);
		
	}


	public int getGoodsNum() {
		 //获取出商品的数量
		List<Goods> goods = goodsMapper.getGoodsList();
	    return goods.size();
	    }


	@Override
    public List<Goods> getPageGoods(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Goods> list =goodsMapper.getGoodsList();
		return list;
	}


	public List<Goods> getPageGoodsByGoods(Integer id,String name,Integer status, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Goods> list =goodsMapper.getPageGoodsByGoods(id,name,status);
		return list;
	}
	

	public CommentExtend selectCommentsByGoodsId(Integer id) {
		return goodsMapper.selectCommentsByGoodsId(id);
	}


	public void addComments(Comments comments) {
		goodsMapper.addComments(comments);
	}
}

