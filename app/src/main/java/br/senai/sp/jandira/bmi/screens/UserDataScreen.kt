package br.senai.sp.jandira.bmi.screens

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Tag
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen(navegador: NavHostController, modifier: Modifier) {

    var ageState = remember {
        mutableStateOf("")
    }
    var weiState = remember {
        mutableStateOf("")
    }
    var heiState = remember {
        mutableStateOf("")
    }

    val context = LocalContext.current
    val userFile = context
        .getSharedPreferences("userFile", Context.MODE_PRIVATE)

    val userName = userFile.getString("user_name", "User name not found!")

    val editor = userFile.edit()




    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFF3F2621),
                        Color(0xDF8A6B21),

                        )
                )
            )
    ){
        Column (
            modifier = modifier
                .fillMaxSize()
                .background(Color.Transparent),
            verticalArrangement = Arrangement.SpaceBetween

        ){
            Text(
                text = stringResource(
                    R.string.hi) + ", $userName!",
                modifier = modifier
                    .padding(top = 70.dp)
                    .padding(horizontal = 15.dp),
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold
            )
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                modifier = modifier
                    .fillMaxWidth()
                    .height(700.dp)
                    .padding(top = 20.dp),
                shape = RoundedCornerShape(
                    topStart = 33.dp,
                    topEnd = 33.dp
                )


            ) {
                Column (
                    modifier = modifier
                        .fillMaxSize()
                        .padding(top = 20.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Row (
                        modifier = modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center

                    ){
                        Column {
                            Card(colors = CardDefaults.cardColors(
                                containerColor = Color.White

                            ),
                                modifier = modifier
                                    .width(180.dp)
                                    .height(200.dp)
                                    .padding(top = 20.dp)
                                    .border(
                                        width = 5.dp,
                                        color = Color(0xFF6A4E23),
                                        shape = RoundedCornerShape(
                                            topStart = 150.dp,
                                            topEnd = 150.dp,
                                            bottomStart = 150.dp,
                                            bottomEnd = 150.dp


                                        )
                                    ),
                                shape = CircleShape
                            ) {
                                Image(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    painter = painterResource(
                                        R.drawable.img
                                    ),
                                    contentDescription = "",
                                )

                            }
                            Button(
                                onClick = {},
                                colors = ButtonDefaults.buttonColors(Color(0xFF3F2621)),
                                modifier = Modifier
                                    .padding(horizontal = 42.dp)
                                    .width(100.dp)

                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.male
                                    ),
                                    fontWeight = FontWeight.ExtraBold
                                )
                            }
                        }
                        Column (){
                            Card(colors = CardDefaults.cardColors(
                                containerColor = Color.White

                            ),
                                modifier = modifier
                                    .width(180.dp)
                                    .height(200.dp)
                                    .padding(top = 20.dp)
                                    .border(
                                        width = 5.dp,
                                        color = Color(0xFF6A4E23),
                                                shape = RoundedCornerShape(
                                                topStart = 150.dp,
                                        topEnd = 150.dp,
                                        bottomStart = 150.dp,
                                        bottomEnd = 150.dp


                                    )
                                    ),
                                shape = CircleShape
                                ) {
                                Image(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    painter = painterResource(
                                        R.drawable.fem
                                    ),
                                    contentDescription = "",
                                )

                            }

                            Button(
                                onClick = {},
                                colors = ButtonDefaults.buttonColors(Color(0xFF000000)),
                                modifier = Modifier
                                    .padding(horizontal = 45.dp)
                                    .width(100.dp)
                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.female
                                    ),
                                )
                            }
                        }
                    }
                    Column (
                        modifier = modifier
                            .fillMaxWidth()
                            .height(380.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.spacedBy(18.dp)

                    ){
                        OutlinedTextField(
                            value = ageState.value,
                            onValueChange = {
                                ageState.value = it
                            },
                            modifier = modifier
                                .width(320.dp)
                                .padding(bottom = 18.dp),
                            shape = RoundedCornerShape(20.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next

                            ),
                            label = {
                                Text(
                                    text = stringResource(
                                        R.string.age
                                    )
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Tag,
                                    contentDescription = "",
                                    tint = Color(0xFF3F2621)

                                )
                            }

                        )
                        OutlinedTextField(
                            value = weiState.value,
                            onValueChange = {
                                weiState.value = it
                            },
                            modifier = modifier
                                .width(320.dp)
                                .padding(bottom = 18.dp),
                            shape = RoundedCornerShape(20.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next

                            ),
                            label = {
                                Text(
                                    text = stringResource(
                                        R.string.weight
                                    )
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Balance,
                                    contentDescription = "",
                                    tint = Color(0xFF3F2621)

                                )
                            }
                        )
                        OutlinedTextField(
                            value = heiState.value,
                            onValueChange = {
                                heiState.value = it
                            },
                            modifier = modifier
                                .width(320.dp),
                            shape = RoundedCornerShape(20.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Done

                            ),
                            label = {
                                Text(
                                    text = stringResource(
                                        R.string.height
                                    )
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Height,
                                    contentDescription = "",
                                    tint = Color(0xFF3F2621)

                                )
                            }
                        )
                        Button(
                            onClick = {
                                editor.putInt("user_age", ageState.value.toInt())
                                editor.putInt("user_wei", weiState.value.toInt())
                                editor.putFloat("user_hei", heiState.value.toFloat())
                                editor.apply()
                                navegador.navigate("bore")
                            },
                            colors = ButtonDefaults.buttonColors(Color(0xFF3F2621)),
                            modifier = modifier
                                .padding(top = 50.dp)
                                .width(320.dp)
                                .height(50.dp)


                        ) {
                            Text(
                                text = stringResource(
                                    R.string.calculate
                                ),
                                fontSize = 30.sp
                            )
                        }
                    }

                }
            }
        }
    }



}





@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview(){
    //UserDataScreen()
}