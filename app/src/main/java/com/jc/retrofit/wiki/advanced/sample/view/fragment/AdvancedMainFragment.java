package com.jc.retrofit.wiki.advanced.sample.view.fragment;

import com.jc.retrofit.wiki.advanced.error.view.HandlerResponseErrorActivity;
import com.jc.retrofit.wiki.advanced.sample.view.activity.MultipleResponseActivity;
import com.jc.retrofit.wiki.advanced.sample.view.activity.RxJavaObserveOnMainThreadActivity;
import com.jc.retrofit.wiki.base.BaseListFragment;
import com.jc.retrofit.wiki.bean.TargetDummyItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 江俊超 on 2019/1/16.
 * Version:1.0
 * Description:
 * ChangeLog:
 */
public class AdvancedMainFragment extends BaseListFragment {
    @Override
    protected List<TargetDummyItem> initTargets() {
        List<TargetDummyItem> datas = new ArrayList<>();

        datas.add(new TargetDummyItem("RxJavaObserveOnMainThread",
                "不使用RxAndroid做线程切换，自己通过集成CallAdapter.Factory实现线程切换",
                RxJavaObserveOnMainThreadActivity.class));
        datas.add(new TargetDummyItem("多返回数据格式处理及code提前处理",
                "应对在APP中请求接口有多种数据格式返回，需要做适配。还有就是需要对错误码进行统一的预处理。",
                MultipleResponseActivity.class));
        datas.add(new TargetDummyItem("统一状态码/错误处理",
                "1.统一对返回结果中的状态码做统一的处理，开发者只关心拿到的data。\n2.对Exaction进行统一的抓取和处理。",
                HandlerResponseErrorActivity.class));
        return datas;
    }

    public AdvancedMainFragment() {
    }
}
