package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
@WebNavigationClient.ExperimentalNavigationCallback
public interface NavigationListener {
    default void onFirstContentfulPaint(Page page, long j6) {
    }

    default void onNavigationCompleted(Navigation navigation) {
    }

    default void onNavigationRedirected(Navigation navigation) {
    }

    default void onNavigationStarted(Navigation navigation) {
    }

    default void onPageDeleted(Page page) {
    }

    default void onPageDomContentLoadedEvent(Page page) {
    }

    default void onPageLoadEvent(Page page) {
    }
}
