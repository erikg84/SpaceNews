package com.example.spacenews.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide

import com.example.spacenews.R
import com.example.spacenews.databinding.FragmentDetailViewBinding
import com.example.spacenews.models.LaunchesResponse

/**
 * A simple [Fragment] subclass.
 */
class DetailViewFragment : Fragment() {

    private var _bind:FragmentDetailViewBinding?=null
    private val bind get()  = _bind!!
    private lateinit var launches:List<LaunchesResponse>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _bind = FragmentDetailViewBinding.inflate(inflater,container,false)
        @Suppress("UNCHECKED_CAST")
        launches = arguments?.get("launchList") as List<LaunchesResponse>
        setupBackground()
        return bind.root
    }

    private fun setupBackground() {
        Glide.with(this)
            .load(launches[0].links?.missionPatch)
            .into(bind!!.patchDetailView)
        bind.fullMissionDetails.text = launches[0].toString()
    }

    override fun onDestroy() {
        super.onDestroy()
        _bind = null
    }

}
