package retrofit2;

import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface Converter<F, T> {
    @Nullable
    T convert(F f10) throws IOException;
}
