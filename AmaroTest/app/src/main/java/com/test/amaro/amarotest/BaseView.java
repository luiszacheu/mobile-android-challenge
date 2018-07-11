package com.test.amaro.amarotest;

/**
 * Created by luiszacheu on 11/07/18.
 */
public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);
}
