package ru.hand_build.android.githubsearcher;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by vladimir on 15.06.15.
 */
public class GitAdapter extends RecyclerView.Adapter<GitAdapter.ViewHolder> {
    private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        View v;
        TextView name;
        Button like;
        TextView description;
        Button watchers;
        Button forks;
        Button owner;
        TextView website;

        public ViewHolder(View v) {
            super(v);
            this.v = v;
            name = (TextView) name.findViewById(R.id.name);
            like = (Button) like.findViewById(R.id.like);
            description = (TextView) description.findViewById(R.id.description);
            watchers = (Button) watchers.findViewById(R.id.watchers);
            forks = (Button) forks.findViewById(R.id.forks);
            owner = (Button) owner.findViewById(R.id.owner);
            website = (TextView) website.findViewById(R.id.website);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public GitAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public GitAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.name.setText(mDataset[position]);
        /* TODO fill view with model */

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}