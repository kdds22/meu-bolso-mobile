package com.meubolso.app.ui.login

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.meubolso.app.R
import com.meubolso.app.databinding.FragmentLoginBinding
import com.meubolso.app.databinding.LoginCadastroFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private val navController by lazy {
        getNavControllerMain(requireActivity())
    }

    private val viewModel: LoginViewModel by viewModel()
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater,container,false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.entrarLogin.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToLoginCadastroFragment()
            navController.navigate(action)
        }
    }

    private fun getNavControllerMain(activity: Activity): NavController {
        return Navigation.findNavController(activity, R.id.nav_host_fragment)
    }

}