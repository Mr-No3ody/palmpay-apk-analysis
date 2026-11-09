package com.luck.picture.lib.config;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class SelectorProviders {
    private static volatile SelectorProviders selectorProviders;
    private final LinkedList<SelectorConfig> selectionConfigsQueue = new LinkedList<>();

    public static SelectorProviders getInstance() {
        if (selectorProviders == null) {
            synchronized (SelectorProviders.class) {
                try {
                    if (selectorProviders == null) {
                        selectorProviders = new SelectorProviders();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return selectorProviders;
    }

    public void addSelectorConfigQueue(SelectorConfig selectorConfig) {
        this.selectionConfigsQueue.add(selectorConfig);
    }

    public void destroy() {
        SelectorConfig selectorConfig = getSelectorConfig();
        if (selectorConfig != null) {
            selectorConfig.destroy();
            this.selectionConfigsQueue.remove(selectorConfig);
        }
    }

    public SelectorConfig getSelectorConfig() {
        return this.selectionConfigsQueue.size() > 0 ? this.selectionConfigsQueue.getLast() : new SelectorConfig();
    }

    public void reset() {
        for (int i7 = 0; i7 < this.selectionConfigsQueue.size(); i7++) {
            SelectorConfig selectorConfig = this.selectionConfigsQueue.get(i7);
            if (selectorConfig != null) {
                selectorConfig.destroy();
            }
        }
        this.selectionConfigsQueue.clear();
    }
}
