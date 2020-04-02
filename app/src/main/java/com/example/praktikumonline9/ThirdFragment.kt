package com.example.praktikumonline9


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

/**
 * A simple [Fragment] subclass.
 */
class ThirdFragment : Fragment() {

    private var communicationViewModel: CommunicationViewModel? = null
    private var txtName2: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.of(requireActivity()).get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtName2 = view.findViewById((R.id.textViewName2))
        communicationViewModel!!.name2.observe(requireActivity(), Observer { s -> txtName2!!.text = s })
    }

    companion object {
        fun newInstance(): ThirdFragment {
            return ThirdFragment()
        }
    }

}
