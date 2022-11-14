package com.example.bminavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.bminavigation.databinding.FragmentMainBinding
import java.math.RoundingMode
import kotlin.math.pow


class MainF : Fragment() {
    private lateinit var binding: FragmentMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        arguments?.let {

        }





    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button: Button =requireView().findViewById(R.id.sendButton)
        val navController=this.findNavController()

        var testAdatok=Testadatok(0f,0f,0f,0f)
        binding=DataBindingUtil.setContentView(this.requireActivity(),R.layout.fragment_main)
        binding.testadat=testAdatok

        button.setOnClickListener{
            var magassag=binding.magassagInput.text.toString().toFloat()
            var testsuly=binding.magassagInput.text.toString().toFloat()
            var cmMagassag=magassag/100

            var bmi=testsuly/cmMagassag.pow(2)
            testAdatok.bmiIndex=bmi //.toBigDecimal().setScale(2,RoundingMode.HALF_UP).toFloat()


            var review:String="";

            if(bmi<16){
                review="Kóros soványság"
            }else if (bmi>=16 && bmi<=17){
                review="Mérsékelt soványság"
            }else if (bmi>17 && bmi<=18.5){
                review="Enyhe soványság"
            }else if (bmi>18.5 && bmi<=25){
                review="Normális testsúly"
            }else if (bmi>25 && bmi<=30){
                review="Elhízás"
            }else if (bmi>30 && bmi<=35){
                review="Túlzott elhízás"
            }else if(bmi<=40){
                review="Túlzott elhízás"
            }



            //  Frissít
            binding.invalidateAll()

            navController.navigate(MainFDirections.actionMainFToResultsF())
        }


    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        //inflater?.inflate(R.menu.opmenu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return NavigationUI.onNavDestinationSelected(item,requireView().findNavController()) ||
        return super.onOptionsItemSelected(item)
    }


}