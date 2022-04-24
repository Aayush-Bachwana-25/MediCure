package com.example.medicure;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.ViewHolder> {
    private Person[] localDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private Person person=new Doctor();

        public ViewHolder(View view){
            super(view);
            person.imageViewPerson=(ImageView)view.findViewById(R.id.imageHome);
            person.personName=(TextView)view.findViewById(R.id.textViewName);
            person.degree=(TextView)view.findViewById(R.id.textViewDegree);
            person.mobile=(TextView)view.findViewById(R.id.textViewMobile);
        }

        public Person getPerson(){
            return person;
        }

    }

    DoctorAdapter(Person[] members){
        this.localDataSet=members;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_home,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.getPerson().imageViewPerson.setImageResource((localDataSet[position].imageViewPerson));
        holder.getPerson().personName.setText((localDataSet[position]).personName.getText().toString());
        holder.getPerson().degree.setText((localDataSet[position]).degree.getText().toString());
        holder.getPerson().mobile.setText((localDataSet[position]).mobile.getText().toString());
    }

    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}
