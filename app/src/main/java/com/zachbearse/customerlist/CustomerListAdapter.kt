package com.zachbearse.customerlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomerListAdapter(
    private val customers: List<Customer>
) : RecyclerView.Adapter<CustomerListAdapter.CustomerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomerViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.customer_list_item, parent, false)
        return CustomerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CustomerViewHolder, position: Int) {
        val current = customers[position]
        holder.nameView.text = "${current.firstName} ${current.lastName}"
        holder.phoneNumView.text = current.phoneNo
        holder.addressView.text = current.address
        holder.cityStateView.text = "${current.city}, ${current.state}"
    }

    override fun getItemCount() = customers.size

    class CustomerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameView: TextView = view.findViewById(R.id.nameView)
        val phoneNumView: TextView = view.findViewById(R.id.phoneNumView)
        val addressView: TextView = view.findViewById(R.id.addressView)
        val cityStateView: TextView = view.findViewById(R.id.cityStateView)
    }
}