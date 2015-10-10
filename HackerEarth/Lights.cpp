#include <iostream>
#include <cstdio>
#include <cstring>
#include <algorithm>
 using namespace std;
unsigned int b[32], ob[32];
long long imap[32];
 
inline void click(int x, int y, bool print = false) {
	if (print) printf("%d %d\n", y, x);
	b[y-1] ^= 1<< x;
	b[y  ] ^= 7<<(x-1);
	b[y+1] ^= 1<< x;
}
 
int lights(int n, int ans, bool print = false) {
	int ct = 0;
	for (int x = 0; x < n; x++) if ((ans>>x)&1) {
		click(x+1, 1, print);
		ct++;
	}
	for (int y = 1; y < n; y++) for (int x = 1; x <= n; x++) if ((b[y]>>x)&1) {
		click(x, y+1, print);
		ct++;
	}
	b[n] &= (1ll<<(n+1))-2;
	return ct;
}
 
void genIMap(int n) {
	for (int i = 0; i < n; i++) {
		memset(b, 0, sizeof(b));
		lights(n, 1<<i);
		imap[i] = (((long long)b[n])<<5)|i;
	}
	std::sort(imap, imap+n);
}
 
int solve(unsigned int s, int x) {
	if (!s) return 0;
	unsigned int m = (unsigned int)(imap[x]>>5);
	if (x < 0 || (s&~m) > m) return -1;
	long long em = s;
	em = (em << 5)|x;
 
	int res = solve(s, x-1);
	if (res >= 0) return res;
	res = solve(s^m, x-1) | (1<<(imap[x]&31));
	return res;
}
 
int main() {
	int t;
//	scanf("%d", &t);
	
		int n;
		scanf("%d", &n);
		genIMap(n);
		
		for(int i=0;i<32;i++){
		std::cout<<imap[i];
		}
	return 0;
}
