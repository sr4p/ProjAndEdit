package com.s59161126.emergencys


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.s59161126.emergencys.databinding.FragmentStartBinding

/**
 * A simple [Fragment] subclass.
 */
class start : Fragment() {

    override fun onCreateView(


        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentStartBinding>(inflater,R.layout.fragment_start,container,false)
        binding.buttonStart.setOnClickListener { view : View ->
//            view.findNavController().navigate(R.id.action_start2_to_index)
//            var Tname  = view.findViewById<EditText>(R.id.Enter_name)
//
            view.findNavController().navigate(startDirections.actionStart2ToIndex(binding.EnterName.text.toString()))
        }
//        Toast.makeText(context,"Hello", Toast.LENGTH_LONG).show()
//        setHasOptionsMenu(true)
        return binding.root
    }

}
