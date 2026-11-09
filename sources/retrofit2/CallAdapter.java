package retrofit2;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public interface CallAdapter<R, T> {
    T adapt(Call<R> call);

    Type responseType();
}
