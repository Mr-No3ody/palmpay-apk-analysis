package Tb;

import android.text.LoginFilter;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends LoginFilter.UsernameFilterGeneric {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9067b;

    public /* synthetic */ b(int i7) {
        this.f9066a = i7;
        this.f9067b = "";
    }

    @Override // android.text.LoginFilter.UsernameFilterGeneric, android.text.LoginFilter
    public final boolean isAllowed(char c6) {
        switch (this.f9066a) {
            case 0:
                if ('a' <= c6 && c6 <= 'z') {
                    return true;
                }
                if ('A' <= c6 && c6 <= 'Z') {
                    return true;
                }
                String str = this.f9067b;
                return (TextUtils.isEmpty(str) || str.indexOf(c6) == -1) ? false : true;
            case 1:
                return this.f9067b.indexOf(c6) < 0;
            default:
                if ('0' <= c6 && c6 <= '9') {
                    return true;
                }
                String str2 = this.f9067b;
                return (TextUtils.isEmpty(str2) || str2.indexOf(c6) == -1) ? false : true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b() {
        this("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]\n");
        this.f9066a = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(false);
        this.f9066a = 1;
        this.f9067b = str;
    }
}
