package com.example.zhikunfan_lab02
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class HomeListFragment : Fragment() {

    companion object {
        private const val ARG_HOME_TYPE = "home_type"

        fun newInstance(homeType: String): HomeListFragment {
            val fragment = HomeListFragment()
            val args = Bundle()
            args.putString(ARG_HOME_TYPE, homeType)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val homeType = arguments?.getString(ARG_HOME_TYPE)
        // TODO: Load homes based on homeType and display them
    }
}
