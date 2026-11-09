package com.palmpay.lib.bridgewrapper.picker.bean;

import androidx.annotation.Keep;
import com.palmpay.lib.ui.picker.wheel.interfaces.IPickerViewData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class CascadePickerBean {
    private List<DataDTO> data;
    private int selectedIndex;
    private String title;

    public static class DataDTO implements IPickerViewData {
        private List<DataDTO> children;
        private Integer code;
        private String name;

        @Override // com.palmpay.lib.ui.picker.wheel.interfaces.IPickerViewData
        public List<DataDTO> getChildList() {
            return this.children;
        }

        public List<DataDTO> getChildren() {
            return this.children;
        }

        public Integer getCode() {
            return this.code;
        }

        public String getName() {
            return this.name;
        }

        @Override // com.palmpay.lib.ui.picker.wheel.interfaces.IPickerViewData
        public String getPickerViewText() {
            return this.name;
        }

        public void setChildren(List<DataDTO> list) {
            this.children = list;
        }

        public void setCode(Integer num) {
            this.code = num;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    public List<DataDTO> getData() {
        return this.data;
    }

    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    public String getTitle() {
        return this.title;
    }

    public void setData(List<DataDTO> list) {
        this.data = list;
    }

    public void setSelectedIndex(int i7) {
        this.selectedIndex = i7;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
