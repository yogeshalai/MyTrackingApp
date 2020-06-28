package com.devgrace.mytrackapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.devgrace.mytrackapp.R
import com.devgrace.mytrackapp.ui.viewmodel.MainViewModel
import com.devgrace.mytrackapp.ui.viewmodel.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()

}