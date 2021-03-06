package test.bwie.com.bawaymail.view.iview;

import test.bwie.com.bawaymail.model.bean.AddCartBean;
import test.bwie.com.bawaymail.model.bean.BuyNowBean;
import test.bwie.com.bawaymail.model.bean.GoodsDetailBean;
import test.bwie.com.bawaymail.model.bean.OrderBean;
import test.bwie.com.bawaymail.model.bean.PayDataBean;
import test.bwie.com.bawaymail.model.bean.PayMentInfo;
import test.bwie.com.bawaymail.model.bean.PredepositBean;
import test.bwie.com.bawaymail.model.bean.ShopDetailBean;
import test.bwie.com.bawaymail.model.bean.ShopItemBean;
import test.bwie.com.bawaymail.model.bean.TypeBean;

/**
 * @ Description:
 * @ Date:2017/6/13
 * @ Author:刘刚
 */

public interface TypeView<T>extends IView {
    void getDataSuc(TypeBean t);
    void getDataErr(String str,int code);

    void getShopDetailSuc(ShopDetailBean t);
    void getShopSuc(ShopDetailBean t);

    void getItemData(ShopItemBean t);

    void getGoodsDetail(GoodsDetailBean t);
    void getGoodsItduData(String str);

    void getGoodsBuyNowData(BuyNowBean str);

    void getGoodsAddCartData(AddCartBean str);

    void getGoodsPreIdData(PayDataBean str);

    void getOrderData(OrderBean str);

    void getPayList(PayMentInfo st);
    void getPredeposit(PredepositBean st);
}
