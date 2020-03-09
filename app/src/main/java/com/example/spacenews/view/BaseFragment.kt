package com.example.spacenews.view

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

import com.example.spacenews.R
import com.example.spacenews.databinding.FragmentBaseBinding
import com.example.spacenews.models.LaunchesResponse
import com.example.spacenews.viewmodel.MainViewModel

/**
 * A simple [Fragment] subclass.
 */
class BaseFragment : Fragment() {

    private var _bind:FragmentBaseBinding?=null
    private val bind get()  = _bind!!
    private lateinit var viewModel: MainViewModel
    private lateinit var launches:List<LaunchesResponse>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        launches = ArrayList()
        launchCoroutine()
        _bind = FragmentBaseBinding.inflate(inflater, container, false)
        bind.profileImage.setOnClickListener {launchNavigation()}
        return bind.root
    }
    private fun launchCoroutine(){
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getLaunchesObservable()
        viewModel.getLaunches().observe(viewLifecycleOwner, Observer {historicLaunches ->
            launches = historicLaunches
        })
    }
    private fun launchNavigation(){
        val bundle = bundleOf("launchList" to launches)
        this.findNavController().navigate(R.id.next_lisview,bundle)
    }

    override fun onDestroy() {
        super.onDestroy()
        _bind = null
    }

}
