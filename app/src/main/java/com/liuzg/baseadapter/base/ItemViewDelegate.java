package com.liuzg.baseadapter.base;

import com.liuzg.baseadapter.ViewHolder;

public interface ItemViewDelegate <T>
{

    public abstract int getItemViewLayoutId();

    public abstract boolean isForViewType(T item, int position);

    public abstract void convert(ViewHolder holder, T t, int position);



}
