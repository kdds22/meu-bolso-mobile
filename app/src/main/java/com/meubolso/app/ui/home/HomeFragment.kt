package com.meubolso.app.ui.home

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.meubolso.app.R
import com.meubolso.app.databinding.FragmentHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private val navController by lazy {
        getNavControllerMain(requireActivity())
    }

    private val viewModel: HomeViewModel by viewModel()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.entrarLogin.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
            navController.navigate(action)
        }

        binding.cadastrarLogin.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToCadastroFragment()
            navController.navigate(action)
        }

    }

    private fun getNavControllerMain(activity: Activity): NavController {
        return Navigation.findNavController(activity, R.id.nav_host_fragment)
    }

}