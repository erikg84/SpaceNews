package com.example.spacenews.adapter

import android.content.res.Resources
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Glide.init
import com.example.spacenews.R
import com.example.spacenews.databinding.FragmentBaseBinding
import com.example.spacenews.databinding.FragmentDetailViewBinding
import com.example.spacenews.databinding.FragmentListViewBinding
import com.example.spacenews.databinding.RowBinding
import com.example.spacenews.models.LaunchesResponse


class SpacexAdapter(val listener: (Int) -> Unit) : RecyclerView.Adapter<SpacexAdapter.MainHolder>() {

    private var historicLaunches:List<LaunchesResponse>

    init {
        historicLaunches = ArrayList()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val rowBinding = RowBinding.inflate(LayoutInflater.from(parent.context))
        return MainHolder(rowBinding)
    }

    override fun getItemCount() = historicLaunches.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val launch = historicLaunches.get(position)
        holder.bind?.launch = launch
        Glide.with(holder.itemView)
            .load(launch.links?.missionPatch)
            .into(holder.bind!!.patchImage)


        holder.bind?.rowLayout?.setOnClickListener{
            if(!isTablet()){
                val launchList= mutableListOf<LaunchesResponse>()
                launchList.add(launch)
                val bundle = bundleOf("launchList" to launchList)
                holder.itemView.findNavController().navigate(R.id.next_detailview,bundle)
            }else{
                listener(position)
            }

        }
    }

    class MainHolder(binding:RowBinding) : RecyclerView.ViewHolder(binding.root) {
        var bind:RowBinding?=null
        init {
            bind = binding
        }
    }

    fun addList(newList:List<LaunchesResponse>){historicLaunches = newList}

    private fun isTablet():Boolean{
        var tablet = false
        val pixelWidth = Resources.getSystem().getDisplayMetrics().widthPixels
        val pixelHeight = Resources.getSystem().getDisplayMetrics().heightPixels

        val widthDpi = Resources.getSystem().getDisplayMetrics().xdpi
        val heightDpi = Resources.getSystem().getDisplayMetrics().ydpi

        val widthInches = pixelWidth/widthDpi
        val heighInches = pixelHeight/heightDpi

        val diagonalInches = Math.sqrt((widthInches*widthInches).toDouble()+(heighInches*heighInches))

        if(diagonalInches >= 7){tablet = true}

        return tablet
    }
}