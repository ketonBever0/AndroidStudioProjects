package com.example.recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.ListFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview.databinding.FragmentListBinding

class ListF : Fragment() {
    private lateinit var binding: FragmentListBinding
    private lateinit var adapter: PersonAdapter
    private lateinit var layoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var dataset= listOf(
            //  first name, last name, birth year, e-mail, phone number
            Person("Kiss","Elek",1999,"kisselek@gmail.com","+36 20 627 6502"),
            Person("Kiss","Endre",1998,"endrekiss@gmail.com","+36 70 787 3789"),
            Person("Kiss","Ubul",1997,"kubul@gmail.com","+36 50 128 6839"),
            Person("Kiss","Elek",1999,"kelek@gmail.com","+36 20 041 0042"),
            Person("Kiss","Endre",1998,"ekiss@gmail.com","+36 20 240 3245"),
            Person("Kiss","Ubul",1997,"ukiss@gmail.com","+36 31 551 5949"),
            Person("Kiss","Elek",1999,"elekkis@gmail.com","+36 31 551 5949"),
            Person("Kiss","Endre",1998,"endrek@gmail.com","+36 31 284 2878"),
            Person("Kiss","Ubul",1997,"kiubul@gmail.com","+36 20 623 4872"),
            Person("Kiss","Elek",1999,"elekkiss27@gmail.com","+36 70 573 3628"),
            Person("Kiss","Endre",1998,"endre0216@gmail.com","+36 20 395 7975"),
            Person("Kiss","Ubul",1997,"ubul0428@gmail.com","+36 50 163 0352")
        )

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_list,container,false)

        val navController=this.findNavController()
        adapter= PersonAdapter(requireContext(),dataset){
            itemDto:Person,position:Int->
            navController.navigate(ListFDirections.actionListFToDetailF2(itemDto))
        }
        layoutManager=LinearLayoutManager(requireContext())
        binding.lista.adapter=adapter
        binding.lista.layoutManager=layoutManager

        //return inflater.inflate(R.layout.fragment_list, container, false)
        return binding.root
    }

}