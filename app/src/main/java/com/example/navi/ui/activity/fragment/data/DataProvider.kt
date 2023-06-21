package com.example.navi.ui.activity.fragment.data

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.example.navi.R

object DataProvider {

    val benefitsTitleList = listOf(
        BenefitsTitle(
            id = 1,
            title = R.string.Rewards_String,
            description = "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
            benefitsTitleImageId = R.drawable.baseline_integration_instructions_24
        ),
        BenefitsTitle(
            id = 2,
            title = R.string.x_And_Use_P_String,
            description = "Jubilee enjoys thoughtful discussions by the campfire.",
            benefitsTitleImageId = R.drawable.baseline_clean_hands_24
        ),
        BenefitsTitle(
            id = 3,
            title = R.string.travels_String,
            description = "Beezy's favorite past-time is helping you choose your brand color.",
            benefitsTitleImageId = R.drawable.baseline_shopping_bag_24
        ),
        BenefitsTitle(
            id = 4,
            title = R.string.more_String,
            description = "Mochi is the perfect \"rubbery ducky\" debugging pup, always listening.",
            benefitsTitleImageId = R.drawable.baseline_more_24
        )
    )


    val benefitsList = listOf(
        Benefits(
            id = 1,
            title = R.string.earn_instantly_String,
            description = R.string.get_1_point_every_50_spent,
            benefitsTitleImageId = R.drawable.baseline_integration_instructions_24
        ),
        Benefits(
            id = 2,
            title = R.string.no_Limits_String,
            description =  R.string.no_caps_on_earning_because_its_one_card,
            benefitsTitleImageId = R.drawable.baseline_clean_hands_24
        ),
        Benefits(
            id = 3,
            title = R.string.lifetime_validity,
            description =  R.string.your_points_dont_expire_ever,
            benefitsTitleImageId = R.drawable.baseline_shopping_bag_24
        ),
        Benefits(
            id = 4,
            title = R.string.fractional_points,
            description = R.string.get_extra_when_we_add_up_the_decimals,
            benefitsTitleImageId = R.drawable.baseline_more_24
        )
    )
}