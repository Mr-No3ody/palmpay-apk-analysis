package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
@WebNavigationClient.ExperimentalNavigationCallback
public interface Navigation {
    boolean didCommit();

    boolean didCommitErrorPage();

    Page getPage();

    int getStatusCode();

    String getUrl();

    boolean isBack();

    boolean isForward();

    boolean isHistory();

    boolean isReload();

    boolean isRestore();

    boolean isSameDocument();

    boolean wasInitiatedByPage();
}
