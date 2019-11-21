package com.s59161126.emergencys


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.s59161126.emergencys.databinding.FragmentVid1Binding
import com.s59161126.emergencys.databinding.FragmentVid2Binding

/**
 * A simple [Fragment] subclass.
 */
class vid2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_vid2, container, false)

        val binding = DataBindingUtil.inflate<FragmentVid2Binding>(inflater,R.layout.fragment_vid2,container,false)
//        binding.playB2.setOnClickListener { view : View ->
//            view.findNavController().navigate(R.id.action_index_to_vid2)
//        }


        return binding.root

    }


}
