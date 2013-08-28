package com.othelle.android.action;

/**
 * author: v.vlasov
 */
public interface ProgressObserver {

    void setCancellable(Cancellable cancellable);

    void started();

    void cancelled();

    void completed();
}
