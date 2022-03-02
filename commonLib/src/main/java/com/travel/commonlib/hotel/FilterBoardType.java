package com.travel.commonlib.hotel;

import android.text.TextUtils;

import androidx.annotation.Nullable;

public class FilterBoardType {
    String boardType;
    String boardTypeAr;
    boolean isSelect;
    public int count = 0;

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }

    public String getBoardTypeAr() {
        return boardTypeAr;
    }

    public void setBoardTypeAr(String boardTypeAr) {
        this.boardTypeAr = boardTypeAr;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        FilterBoardType filterBoardType = (FilterBoardType) obj;

        return (TextUtils.equals(filterBoardType.boardType, this.boardType));
    }
}
