package com.binar.finalproject.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.binar.finalproject.R
import com.binar.finalproject.databinding.FragmentSplashScreenBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
@SuppressLint("CustomSplashScreen")
class SplashScreen : Fragment() {

    private lateinit var binding : FragmentSplashScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashScreenBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        val bottomNav = requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.visibility = View.GONE
        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashScreen_to_homeFragment)
        }, 5000)
    }


}