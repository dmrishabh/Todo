package com.rishabh.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rishabh.todo.Adapter.ToDoAdapter;
import com.rishabh.todo.Model.ToDoModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView   taskRecyclerView;

    private ToDoAdapter toDoAdapter;

    private List<ToDoModel> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        taskList = new ArrayList<>();

        taskRecyclerView= findViewById(R.id.taskRecyclerView);

        taskRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        toDoAdapter = new ToDoAdapter(this);
        taskRecyclerView.setAdapter(toDoAdapter);

        ToDoModel task = new ToDoModel();
        task.setTask("This is a task");
        task.setStatus(0);
        task.setId(1);

        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);

        toDoAdapter.setTasks(taskList);

    }
}