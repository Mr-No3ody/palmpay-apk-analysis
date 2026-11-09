package com.googlecode.mp4parser.authoring;

import Q4.b;
import W1.l;
import W1.r;
import java.io.Closeable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface Track extends Closeable {
    List<Object> getCompositionTimeEntries();

    long getDuration();

    List<Object> getEdits();

    String getHandler();

    String getName();

    List<Object> getSampleDependencies();

    l getSampleDescriptionBox();

    long[] getSampleDurations();

    Map<Object, long[]> getSampleGroups();

    List<Sample> getSamples();

    r getSubsampleInformationBox();

    long[] getSyncSamples();

    b getTrackMetaData();
}
