package com.example.guest.ourrestaurants.util;

/**
 * Created by Guest on 12/12/16.
 */
public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
