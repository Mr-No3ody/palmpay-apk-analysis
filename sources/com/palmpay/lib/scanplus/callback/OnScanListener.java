package com.palmpay.lib.scanplus.callback;

import com.palmpay.lib.scanplus.bean.CodeBean;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH&¨\u0006\u000b"}, d2 = {"Lcom/palmpay/lib/scanplus/callback/OnScanListener;", "", "onCancel", "", "onPointClick", "codeBean", "Lcom/palmpay/lib/scanplus/bean/CodeBean;", "onResult", "", "result", "", "lib_scanplus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface OnScanListener {
    void onCancel();

    void onPointClick(@NotNull CodeBean codeBean);

    boolean onResult(@NotNull List<? extends CodeBean> result);
}
