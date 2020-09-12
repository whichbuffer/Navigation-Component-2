package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        btn_accept.setOnClickListener{
            val age = et_enterAge.text.toString().toInt()
            val name = et_enterName.text.toString()

            val user = User(name,age)
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(user,"Arda",20)


            if(name.trim() == ""){
                Toast.makeText(context, "name field can't be empty", Toast.LENGTH_SHORT).show()

            }else{
                findNavController().navigate(action)
            }


        }
    }

}