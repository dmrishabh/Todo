package com.rishabh.todo.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;


import androidx.recyclerview.widget.RecyclerView;

import com.rishabh.todo.MainActivity;
import com.rishabh.todo.Model.ToDoModel;
import com.rishabh.todo.R;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder> {

    private List<ToDoModel> toDoModelList;
    private MainActivity mainActivity;

    public ToDoAdapter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_layout, parent, false);
        return new ViewHolder(itemView);
    }
    public void onBindViewHolder (ViewHolder holder,int position){
        ToDoModel item = toDoModelList.get(position);
        holder.task.setText(item.getTask());
        holder.task.setChecked(toBoolean(item.getStatus()));

    }

    public int getItemCount(){
        return toDoModelList.size();
    }

    private boolean toBoolean(int n ){
        return n!=0;
    }

    public void setTasks(List<ToDoModel> toDoList){
        this.toDoModelList = toDoList;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox task;

        ViewHolder(View view) {
            super(view);
            task = view.findViewById(R.id.todoCheckbox);

        }
    }
}




















