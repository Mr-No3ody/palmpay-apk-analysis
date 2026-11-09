package androidx.navigation;

import C0.AbstractC0130w;
import C0.K;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"androidx/navigation/NavController$OnDestinationChangedListener", "", "LC0/w;", "controller", "LC0/K;", FirebaseAnalytics.Param.DESTINATION, "Landroid/os/Bundle;", "arguments", "", "onDestinationChanged", "(LC0/w;LC0/K;Landroid/os/Bundle;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NavController$OnDestinationChangedListener {
    void onDestinationChanged(@NotNull AbstractC0130w controller, @NotNull K destination, @Nullable Bundle arguments);
}
