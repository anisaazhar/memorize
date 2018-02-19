package co.id.memorize.ui.extension;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class BaseViewHolder<I> extends RecyclerView.ViewHolder {

    public BaseViewHolder(@LayoutRes int resId, @NonNull ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(resId, parent, false));
    }

    public void bindView(I object){}
}
