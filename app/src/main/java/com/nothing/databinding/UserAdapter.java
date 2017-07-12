package com.nothing.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nothing.databinding.databinding.UserItemBinding;

import java.util.List;

/**
 * Created by THM on 7/12/2017.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private List<User> mUserList;

    public UserAdapter(List<User> userList) {
        mUserList = userList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        UserItemBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.user_item,
            parent, false);
        View v = binding.getRoot();
        return new ViewHolder(v, binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindData(mUserList.get(position));
    }

    @Override
    public int getItemCount() {
        return mUserList.isEmpty() ? 0 : mUserList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private UserItemBinding mBinding;

        ViewHolder(View itemView, UserItemBinding binding) {
            super(itemView);
            mBinding = binding;
        }

        void bindData(User user) {
            if (user != null)
                mBinding.setUser(user);
        }
    }
}
