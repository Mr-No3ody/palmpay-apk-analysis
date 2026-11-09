package p360y2;

import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements DataSubscriber {
    @Override // com.facebook.datasource.DataSubscriber
    public void onFailure(@Nonnull DataSource<Object> dataSource) {
        try {
            onFailureImpl(dataSource);
        } finally {
            dataSource.close();
        }
    }

    public abstract void onFailureImpl(DataSource dataSource);

    @Override // com.facebook.datasource.DataSubscriber
    public void onNewResult(@Nonnull DataSource<Object> dataSource) {
        boolean zIsFinished = dataSource.isFinished();
        try {
            onNewResultImpl(dataSource);
        } finally {
            if (zIsFinished) {
                dataSource.close();
            }
        }
    }

    public abstract void onNewResultImpl(DataSource dataSource);

    @Override // com.facebook.datasource.DataSubscriber
    public void onCancellation(@Nonnull DataSource<Object> dataSource) {
    }

    @Override // com.facebook.datasource.DataSubscriber
    public void onProgressUpdate(@Nonnull DataSource<Object> dataSource) {
    }
}
