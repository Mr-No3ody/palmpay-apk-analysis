package retrofit2;

import java.io.IOException;
import okhttp3.Y;

/* JADX INFO: loaded from: classes4.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    /* JADX INFO: renamed from: clone */
    Call<T> mo136clone();

    void enqueue(Callback<T> callback);

    K<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Y request();

    Pg.F timeout();
}
