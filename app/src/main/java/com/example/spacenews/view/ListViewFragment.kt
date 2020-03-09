package com.example.spacenews.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide

import com.example.spacenews.R
import com.example.spacenews.adapter.SpacexAdapter
import com.example.spacenews.databinding.FragmentListViewBinding
import com.example.spacenews.models.LaunchesResponse
import com.example.spacenews.viewmodel.MainViewModel

/**
 * A simple [Fragment] subclass.
 */
class ListViewFragment : Fragment() {

    private var _bind:FragmentListViewBinding?=null
    private val bind get() = _bind!!
    private lateinit var launches:List<LaunchesResponse>
    private lateinit var adapter:SpacexAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _bind = FragmentListViewBinding.inflate(inflater,container,false)
        @Suppress("UNCHECKED_CAST")
        launches = arguments?.get("launchList") as List<LaunchesResponse>
        bind.recyclerview.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        adapter = SpacexAdapter{position ->
            bind.masterMissionDetails?.text = launches.get(position).toString()
            Glide.with(this)
                .load(launches.get(position).links?.missionPatch)
                .into(bind.masterDetailView!!)
        }
        adapter.addList(launches)
        adapter.notifyDataSetChanged()
        bind.recyclerview.adapter = adapter
        return bind.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _bind = null
    }

}
