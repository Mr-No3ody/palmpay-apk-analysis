package com.transsnet.palmpay.core.bean;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class CloseContactTag {
    public Integer count;
    public String tag;

    public CloseContactTag(String tag) {
        this.tag = tag;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 == null || getClass() != o10.getClass()) {
            return false;
        }
        return Objects.equals(this.tag, ((CloseContactTag) o10).tag);
    }

    public int hashCode() {
        return Objects.hash(this.tag);
    }
}
