package com.s59161126.emergencys


import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.s59161126.emergencys.databinding.FragmentIndexBinding
import com.s59161126.emergencys.databinding.FragmentVid1Binding
import com.s59161126.emergencys.databinding.FragmentVid2Binding

/**
 * A simple [Fragment] subclass.
 */
class vid1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentVid1Binding>(inflater,R.layout.fragment_vid1,container,false)
//        binding.backIn1.setOnClickListener { view : View ->
//            view.findNavController().navigate(R.id.action_vid1_to_index)
//        }
        return binding.root
//        return inflater.inflate(R.layout.fragment_vid1, container, false)
    }


}
