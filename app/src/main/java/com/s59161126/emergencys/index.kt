package com.s59161126.emergencys


import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.s59161126.emergencys.databinding.FragmentIndexBinding

/**
 * A simple [Fragment] subclass.
 */
class index : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentIndexBinding>(inflater,R.layout.fragment_index,container,false)
        binding.b1.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_index_to_addinfo)



        }

//        binding.helpbutton.setOnClickListener { view : View ->
//            view.findNavController().navigate(R.id.action_index_to_assistant)
//        }

        val args = indexArgs.fromBundle(arguments!!)
        binding.nameTime.setText(args.txtName)
        val gg = binding.nameTime.setText(args.txtName)
        Toast.makeText(context,"Hello ${args.txtName}", Toast.LENGTH_LONG).show()

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
}
